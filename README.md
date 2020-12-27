# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 08-24-lancando-exception-de-desserializacao-na-atualizacao-parcial-patch
git add .
git commit -m "Lançando exception de desserialização na atualização parcial (PATCH)"
git push origin 08-24-lancando-exception-de-desserializacao-na-atualizacao-parcial-patch

git checkout master
git merge --no-ff 08-24-lancando-exception-de-desserializacao-na-atualizacao-parcial-patch
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