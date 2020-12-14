# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 04-33-analisando-solucao-para-atualizacao-parcial-de-recursos-com-patch
git add .
git commit -m "Analisando solução para atualização parcial de recursos com PATCH"
git push origin 04-33-analisando-solucao-para-atualizacao-parcial-de-recursos-com-patch

git checkout master
git merge --no-ff 04-33-analisando-solucao-para-atualizacao-parcial-de-recursos-com-patch
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```