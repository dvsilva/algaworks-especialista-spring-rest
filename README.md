# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 04-21-corrigindo-o-status-http-para-resource-inexistente
git add .
git commit -m "Corrigindo o Status HTTP para resource inexistente"
git push origin 04-21-corrigindo-o-status-http-para-resource-inexistente

git checkout master
git merge --no-ff 04-21-corrigindo-o-status-http-para-resource-inexistente
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